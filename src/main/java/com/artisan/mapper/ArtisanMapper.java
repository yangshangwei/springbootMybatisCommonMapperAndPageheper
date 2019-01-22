package com.artisan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.artisan.common.CommonMapper;
import com.artisan.model.Artisan;
/**
 * 
 * @author yangshangwei
 *	
 * 增加@Mapper这个注解之后，Spring 启动时会自动扫描该接口，这样就可以在需要使用时直接注入 Mapper 了
 * 
 * 使用通用mapper,在Mapper接口层继承刚才的CommonMapper接口，这样单表的增删改查就实现了，无须xml
 */

@Mapper
public interface ArtisanMapper  extends CommonMapper<Artisan>{
	
	
	
}
