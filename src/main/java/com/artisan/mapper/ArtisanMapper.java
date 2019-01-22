package com.artisan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.artisan.common.CommonMapper;
import com.artisan.model.Artisan;
/**
 * 
 * @author yangshangwei
 *	
 * 增加@Mapper这个注解之后，Spring 启动时会自动扫描该接口，这样就可以在需要使用时直接注入 Mapper 了
 * 
 * 使用通用mapper,在Mapper接口层继承刚才的CommonMapper接口，这样单表的增删改查就实现了，无须xml
 * 
 * 当然了，可以使用内置通用mapper
 * 
 * 也可以使用xml 或者注解
 */

@Mapper
public interface ArtisanMapper  extends CommonMapper<Artisan>{
	
	//自己来编写xml，不适用内置的方法
	List<Artisan>  selectAllArtisansByXml();
	
	
	//自己来注解，不适用内置的方法
	@Select("select id,name,sex from artisan")
	List<Artisan> selectAllArtisansByAnno();
}
