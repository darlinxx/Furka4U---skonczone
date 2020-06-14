
package wizut.tpsi.ogloszenia.web;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Darlin
 */

public class OfferFilter implements Serializable {
    
    
    private Integer manufacturerId;
   
    private Integer modelId;
    
    private Integer bodyStyleId;

    public void setBodyStyleId(Integer bodyStyleId) {
        this.bodyStyleId = bodyStyleId;
    }

    public Integer getBodyStyleId() {
        return bodyStyleId;
    }
    
       

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

      
    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public Integer getModelId() {
        return modelId;
    }
    
    
}

