package org.chikim.util.mapper.service;

import org.chikim.util.mapper.CustomMappingObject;
import org.chikim.util.mapper.MappingType;


public class CustomMappingTypeUtil {
		
	public static CustomMappingObject addCustomMappingType(Object object, MappingType mappingType) {
		return addCustomMappingType(object, mappingType, null);
	}

	public static CustomMappingObject addCustomMappingType(Object object, MappingType mappingType, String mappingName) {
		
		new CustomMappingObject(object: object, mappingType: mappingType, mappingName: mappingName)
	}
}
