package crazyit.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Name: admin
 * Date: 2017/3/5
 * Time: 0:34
 */
public class ArcEntityPK implements Serializable {
    private String fromnodeid;
    private String tonodeid;

    @Column(name = "FROMNODEID", nullable = false, length = 40)
    @Id
    public String getFromnodeid() {
        return fromnodeid;
    }

    public void setFromnodeid(String fromnodeid) {
        this.fromnodeid = fromnodeid;
    }

    @Column(name = "TONODEID", nullable = false, length = 40)
    @Id
    public String getTonodeid() {
        return tonodeid;
    }

    public void setTonodeid(String tonodeid) {
        this.tonodeid = tonodeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArcEntityPK that = (ArcEntityPK) o;

        if (fromnodeid != null ? !fromnodeid.equals(that.fromnodeid) : that.fromnodeid != null) return false;
        if (tonodeid != null ? !tonodeid.equals(that.tonodeid) : that.tonodeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fromnodeid != null ? fromnodeid.hashCode() : 0;
        result = 31 * result + (tonodeid != null ? tonodeid.hashCode() : 0);
        return result;
    }
}
