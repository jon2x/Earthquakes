package ru.inno.earthquakes.models.db;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Generated;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.apihint.Internal;

/**
 * @author Artur Badretdinov (Gaket) 05.08.17
 */
@Entity
public class CoordinatesDb {

  @Id
  private long id;

  private double longtitude;
  private double latitude;

  @Generated(1069928000)
  @Internal
  /** This constructor was generated by ObjectBox and may change any time. */
  public CoordinatesDb(long id, double longtitude, double latitude) {
      this.id = id;
      this.longtitude = longtitude;
      this.latitude = latitude;
  }

  @Generated(1915952674)
  public CoordinatesDb() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getLongtitude() {
    return longtitude;
  }

  public void setLongtitude(double longtitude) {
    this.longtitude = longtitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }
}
