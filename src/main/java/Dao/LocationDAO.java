package Dao;

import Model.Location;

import java.util.List;
import java.util.UUID;

public interface LocationDAO {
  Location findById(UUID id);
  List<Location> findAll();

  void save(Location location);

  void upadate(Location location);

    void delete(Location location);

}
