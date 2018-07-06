package cn.zhku.mysql.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 18:41.
 * 说明：
 */

@Entity
@Table(name = "sensor")
public class Sensor implements java.io.Serializable{

    public Sensor() {

    }

    @Id
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private String sensor_id;

    private String sensor_model;

    private float  result_1;
    private float  result_2;
    private float  result_3;
    private float  result_4;

    private boolean s_status;

    private String s_explain;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_model() {
        return sensor_model;
    }

    public void setSensor_model(String sensor_model) {
        this.sensor_model = sensor_model;
    }

    public float getResult_1() {
        return result_1;
    }

    public void setResult_1(float result_1) {
        this.result_1 = result_1;
    }

    public float getResult_2() {
        return result_2;
    }

    public void setResult_2(float result_2) {
        this.result_2 = result_2;
    }

    public float getResult_3() {
        return result_3;
    }

    public void setResult_3(float result_3) {
        this.result_3 = result_3;
    }

    public float getResult_4() {
        return result_4;
    }

    public void setResult_4(float result_4) {
        this.result_4 = result_4;
    }

    public boolean isS_status() {
        return s_status;
    }

    public void setS_status(boolean s_status) {
        this.s_status = s_status;
    }

    public String getS_explain() {
        return s_explain;
    }

    public void setS_explain(String s_explain) {
        this.s_explain = s_explain;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "createtime=" + createtime +
                ", sensor_id='" + sensor_id + '\'' +
                ", sensor_model='" + sensor_model + '\'' +
                ", result_1=" + result_1 +
                ", result_2=" + result_2 +
                ", result_3=" + result_3 +
                ", result_4=" + result_4 +
                ", s_status=" + s_status +
                ", s_explain='" + s_explain + '\'' +
                '}';
    }
}
