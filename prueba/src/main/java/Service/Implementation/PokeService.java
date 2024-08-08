package Service.Implementation;


import Data.PokeData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Service.IPokeService;


@RequiredArgsConstructor
@Service
public class PokeService  implements IPokeService {

    private final PokeData pokeData;

    @Override
    public String getPokemons(int offset, int limit) {
        return pokeData.getPokemons(offset, limit);
    }
}
