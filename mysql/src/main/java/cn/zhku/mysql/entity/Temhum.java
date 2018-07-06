package cn.zhku.mysql.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/13 23:14.
 * 说明：
 */

@Entity
@Table(name = "temhum")
public class Temhum implements java.io.Serializable{

    @Id
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private float temperature;

    private float humidity;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Temhum{" +
                "createtime=" + createtime +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
