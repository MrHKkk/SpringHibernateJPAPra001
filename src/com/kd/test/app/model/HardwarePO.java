package com.kd.test.app.model;




import javax.persistence.*;

/**
 * Created by hksgr on 2016/4/16.
 */
@Entity
@Table(name="hardware_t")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="category")
public class HardwarePO {


    protected int id;

    protected String modelName;
    protected String modelCode;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(nullable = false, name="model_name")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Column(nullable = false, name="model_code")
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
}
