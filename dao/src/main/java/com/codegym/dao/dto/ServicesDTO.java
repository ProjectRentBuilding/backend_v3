package com.codegym.dao.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;

public class ServicesDTO implements Serializable {

    private Integer id;

    @NotNull(message = "Không được để trống")
    @Size(min = 2,message = "Tên dịch vụ phải ít nhất 2 ký tự")
    private String nameService;

    @NotNull(message = "Không được để trống")
    private Integer indexBeforeMonth;

    @NotNull(message = "Không được để trống")
    private Integer indexAfterMonth;

    @NotNull(message = "Không được để trống")
    private Integer consume;

    @NotNull(message = "Không được để trống")
    private String periodic;

    @NotNull(message = "Không được để trống")
    private String  unit;

    @NotNull(message = "Không được để trống")
    private Integer price;

    @NotNull(message = "Không được để trống")
    private Date monthYear;

    @NotNull(message = "Không được để trống")
    private Integer contactId;

    public ServicesDTO() {
    }

    @Override
    public String toString() {
        return "ServiceDTO{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", indexBeforeMonth=" + indexBeforeMonth +
                ", indexAfterMonth=" + indexAfterMonth +
                ", consume=" + consume +
                ", price=" + price +
                ", contactId=" + contactId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Integer getIndexBeforeMonth() {
        return indexBeforeMonth;
    }

    public void setIndexBeforeMonth(Integer indexBeforeMonth) {
        this.indexBeforeMonth = indexBeforeMonth;
    }

    public Integer getIndexAfterMonth() {
        return indexAfterMonth;
    }

    public void setIndexAfterMonth(Integer indexAfterMonth) {
        this.indexAfterMonth = indexAfterMonth;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
}
