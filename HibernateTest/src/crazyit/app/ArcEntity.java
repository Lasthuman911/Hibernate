package crazyit.app;

import javax.persistence.*;

/**
 * Name: admin
 * Date: 2017/3/5
 * Time: 0:34
 */
@Entity
@Table(name = "ARC", schema = "TRULYMESTST")//, catalog = "")
@IdClass(ArcEntityPK.class)
public class ArcEntity {
    private String fromnodeid;
    private String tonodeid;
    private String arctype;
    private String arcattribute;
    private String factoryname;
    private String processflowname;
    private String processflowversion;

    @Id
    @Column(name = "FROMNODEID", nullable = false, length = 40)
    public String getFromnodeid() {
        return fromnodeid;
    }

    public void setFromnodeid(String fromnodeid) {
        this.fromnodeid = fromnodeid;
    }

    @Id
    @Column(name = "TONODEID", nullable = false, length = 40)
    public String getTonodeid() {
        return tonodeid;
    }

    public void setTonodeid(String tonodeid) {
        this.tonodeid = tonodeid;
    }

    @Basic
    @Column(name = "ARCTYPE", nullable = true, length = 40)
    public String getArctype() {
        return arctype;
    }

    public void setArctype(String arctype) {
        this.arctype = arctype;
    }

    @Basic
    @Column(name = "ARCATTRIBUTE", nullable = true, length = 250)
    public String getArcattribute() {
        return arcattribute;
    }

    public void setArcattribute(String arcattribute) {
        this.arcattribute = arcattribute;
    }

    @Basic
    @Column(name = "FACTORYNAME", nullable = true, length = 40)
    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    @Basic
    @Column(name = "PROCESSFLOWNAME", nullable = true, length = 40)
    public String getProcessflowname() {
        return processflowname;
    }

    public void setProcessflowname(String processflowname) {
        this.processflowname = processflowname;
    }

    @Basic
    @Column(name = "PROCESSFLOWVERSION", nullable = true, length = 40)
    public String getProcessflowversion() {
        return processflowversion;
    }

    public void setProcessflowversion(String processflowversion) {
        this.processflowversion = processflowversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArcEntity arcEntity = (ArcEntity) o;

        if (fromnodeid != null ? !fromnodeid.equals(arcEntity.fromnodeid) : arcEntity.fromnodeid != null) return false;
        if (tonodeid != null ? !tonodeid.equals(arcEntity.tonodeid) : arcEntity.tonodeid != null) return false;
        if (arctype != null ? !arctype.equals(arcEntity.arctype) : arcEntity.arctype != null) return false;
        if (arcattribute != null ? !arcattribute.equals(arcEntity.arcattribute) : arcEntity.arcattribute != null)
            return false;
        if (factoryname != null ? !factoryname.equals(arcEntity.factoryname) : arcEntity.factoryname != null)
            return false;
        if (processflowname != null ? !processflowname.equals(arcEntity.processflowname) : arcEntity.processflowname != null)
            return false;
        if (processflowversion != null ? !processflowversion.equals(arcEntity.processflowversion) : arcEntity.processflowversion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fromnodeid != null ? fromnodeid.hashCode() : 0;
        result = 31 * result + (tonodeid != null ? tonodeid.hashCode() : 0);
        result = 31 * result + (arctype != null ? arctype.hashCode() : 0);
        result = 31 * result + (arcattribute != null ? arcattribute.hashCode() : 0);
        result = 31 * result + (factoryname != null ? factoryname.hashCode() : 0);
        result = 31 * result + (processflowname != null ? processflowname.hashCode() : 0);
        result = 31 * result + (processflowversion != null ? processflowversion.hashCode() : 0);
        return result;
    }
}
