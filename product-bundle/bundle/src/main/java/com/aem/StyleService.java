package com.aem;

import java.util.List;

import com.aem.model.StyleMaster;



public interface StyleService {

    /**
     *
     * @param style
     */
	void add( StyleMaster style);

    /**
     *
     * @return
     */
    List<StyleMaster> getStyles() ;

    /**
     *
     * @param id
     * @return
     */
    StyleMaster getStyle(int id);

    /**
     *
     * @param styleId
     */
    void remove (int styleId);

    /**
     *
     * @param style
     */
    void noStyle(StyleMaster style);

}
