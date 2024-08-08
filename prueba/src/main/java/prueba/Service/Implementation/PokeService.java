package prueba.Service.Implementation;


import prueba.Data.PokeData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.Service.IPokeService;



@Service
public class PokeService  implements IPokeService {

    @Autowired private  PokeData pokeData;


    @Override
    public String getPokemons(int offset, int limit) {
        return pokeData.getPokemons(offset, limit);
    }
}
