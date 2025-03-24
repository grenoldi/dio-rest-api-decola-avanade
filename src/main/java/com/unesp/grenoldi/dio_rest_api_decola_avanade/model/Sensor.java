package com.unesp.grenoldi.dio_rest_api_decola_avanade.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_sensor")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String type;
    private String model;
    private int resolution;
    private String unit;
    private String location;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    private SensorReading lastReading;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sensor")
    List<SensorReading> readingHistory;

    public Sensor(long id, String name, String type, String model, int resolution, String unit, String location,
                  SensorReading lastReading, List<SensorReading> readingHistory, User user) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.model = model;
        this.resolution = resolution;
        this.unit = unit;
        this.location = location;
        this.user = user;
        this.lastReading = lastReading;
        this.readingHistory = readingHistory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SensorReading getLastReading() {
        return lastReading;
    }

    public void setLastReading(SensorReading lastReading) {
        this.lastReading = lastReading;
    }

    public List<SensorReading> getReadingHistory() {
        return readingHistory;
    }

    public void setReadingHistory(List<SensorReading> readingHistory) {
        this.readingHistory = readingHistory;
    }
}
