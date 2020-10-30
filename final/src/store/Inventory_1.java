/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vaish
 */
@Entity
@Table(name = "inventory", catalog = "warehouse", schema = "")
@NamedQueries({
    @NamedQuery(name = "Inventory_1.findAll", query = "SELECT i FROM Inventory_1 i"),
    @NamedQuery(name = "Inventory_1.findByItemcode", query = "SELECT i FROM Inventory_1 i WHERE i.itemcode = :itemcode"),
    @NamedQuery(name = "Inventory_1.findByPId", query = "SELECT i FROM Inventory_1 i WHERE i.pId = :pId"),
    @NamedQuery(name = "Inventory_1.findByPname", query = "SELECT i FROM Inventory_1 i WHERE i.pname = :pname")})
public class Inventory_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Item_code")
    private Integer itemcode;
    @Column(name = "PId")
    private Integer pId;
    @Column(name = "Pname")
    private String pname;

    public Inventory_1() {
    }

    public Inventory_1(Integer itemcode) {
        this.itemcode = itemcode;
    }

    public Integer getItemcode() {
        return itemcode;
    }

    public void setItemcode(Integer itemcode) {
        Integer oldItemcode = this.itemcode;
        this.itemcode = itemcode;
        changeSupport.firePropertyChange("itemcode", oldItemcode, itemcode);
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        Integer oldPId = this.pId;
        this.pId = pId;
        changeSupport.firePropertyChange("PId", oldPId, pId);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemcode != null ? itemcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventory_1)) {
            return false;
        }
        Inventory_1 other = (Inventory_1) object;
        if ((this.itemcode == null && other.itemcode != null) || (this.itemcode != null && !this.itemcode.equals(other.itemcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "store.Inventory_1[ itemcode=" + itemcode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
