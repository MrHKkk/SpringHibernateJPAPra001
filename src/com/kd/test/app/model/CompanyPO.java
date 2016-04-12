package com.kd.test.app.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by hksgr on 2016/4/12.
 */
@Entity
@Table(name="company_t")
public class CompanyPO {

    private int id;
    private String companyCode;
    private String companyName;
    private String location;
    private String category;
    private Set<CpuPO> cpuProducts;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="c_code")
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Column(name="c_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Column(name="location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @OneToMany(mappedBy="companyPO", fetch=FetchType.EAGER)
    public Set<CpuPO> getCpuProducts() {
        return cpuProducts;
    }

    public void setCpuProducts(Set<CpuPO> cpuProducts) {
        this.cpuProducts = cpuProducts;
    }
}
