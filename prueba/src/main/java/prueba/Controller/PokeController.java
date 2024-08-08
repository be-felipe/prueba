package prueba.Controller;

import prueba.Service.IPokeService;
import prueba.generated.GetPokemonRequest;
import prueba.generated.GetPokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class PokeController {

    private static final String NAMESPACE_URI = "http://example.com/pokemon/webservice";

    @Autowired
    private IPokeService pokemonService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
        int offset = request.getOffset();
        int limit = request.getLimit();

        String pokemons = pokemonService.getPokemons(offset, limit);

        GetPokemonResponse response = new GetPokemonResponse();
        response.setPokemons(pokemons);
        return response;
    }
}


