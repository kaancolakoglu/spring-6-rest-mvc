package kolthy.springframework.spring6restmvc.services;

import kolthy.springframework.spring6restmvc.model.BeerDTO;
import kolthy.springframework.spring6restmvc.model.BeerStyle;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {
    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory, Integer pageNumber, Integer pageSize);
    public Optional<BeerDTO> getBeerById(UUID id);
    BeerDTO saveNewBeer(BeerDTO beer);

    public void updateBeerById(UUID beerId, BeerDTO beer);

    public void deleteBeer(UUID beerId);

    public void patchBeerById(UUID beerId, BeerDTO beer);
}
