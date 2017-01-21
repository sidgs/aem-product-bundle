package com.aem;

import java.util.List;

import com.aem.model.StyleMaster;



public interface StyleService {
	
	void add( StyleMaster style);
    List<StyleMaster> getStyles() ;
    StyleMaster getStyle(int id);
    void remove (int styleId);
    void noStyle(StyleMaster style);

}
