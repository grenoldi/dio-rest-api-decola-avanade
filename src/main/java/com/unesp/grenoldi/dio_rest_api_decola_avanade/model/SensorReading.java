package com.unesp.grenoldi.dio_rest_api_decola_avanade.model;

import jakarta.persistence.*;

@Entity(name = "tb_sensor_reading")
public class SensorReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String timestamp;
    private String binaryValue;
    @Column(precision = 5)
    private double convertedValue;
    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    public SensorReading(String timestamp, String binaryValue, double convertedValue, Sensor sensor) {
        this.timestamp = timestamp;
        this.binaryValue = binaryValue;
        this.convertedValue = convertedValue;
        this.sensor = sensor;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBinaryValue() {
        return binaryValue;
    }

    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
