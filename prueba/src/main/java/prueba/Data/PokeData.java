package prueba.Data;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class PokeData {


    private  RestTemplate restTemplate;



    @Autowired
    public PokeData(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    /**
     *
     * @Param offset position of first element of the endpoint
     * @Param limit position of the last element of the endpoint
     * @Return String
     * @Since 1.0.0
     */
    public String getPokemons(int offset, int limit) {
        String urlFormat = String.format("https://pokeapi.co/api/v2/pokemon?offset=%d&limit=%d", offset, limit);
        return restTemplate.getForObject(urlFormat, String.class);
    }




}
