package com.artisan.model;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author yangshangwei
 * 
 *         lombok的注解 @Data 注解在类上 提供类所有属性的 getting 和 setting 方法，
 *         此外还提供了equals、canEqual、hashCode、toString 方法
 *         
 *         
 *         创建实体Bean，使用通用Mapper一定要保证实体类字段和数据库字段一致，如果不一致可以利用注解进行映射。
 *			@Column(name = "username")
    		private String name;
 */

@Data
@Table(name = "artisan")
public class Artisan {
	
	@Id
	private Long id;
	private String name;
	private String sex;

}
