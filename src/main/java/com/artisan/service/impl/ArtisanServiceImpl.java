package com.artisan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artisan.mapper.ArtisanMapper;
import com.artisan.model.Artisan;
import com.artisan.service.ArtisanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArtisanServiceImpl implements ArtisanService {

	@Autowired
	private ArtisanMapper artisanMapper;

	/**
	 * 调用 通用mapper提供的方法
	 */
	@Override
	public List<Artisan> getAllArtisanList() {
		return artisanMapper.selectAll();
	}

	@Override
	public List<Artisan> getArtisanListByPage(int pageNum, int pageSize) {
		// 分页插件的使用 第一个参数是当前页 第二个参数是每页显示的条数

		// 引用分页插件以后，Mybatis分页会变得特别简单，
		// 需要注意的是，在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage 静态方法即可，
		// 紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页
		PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc");
		List<Artisan> artisanList = artisanMapper.selectAll();
		// 用PageInfo对结果进行包装
		// PageInfo page = new PageInfo(artisanList);

		
		final PageInfo<Artisan> pageInfo = PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc")
				.doSelectPageInfo(() -> this.artisanMapper.selectAll());
		log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());

		
		PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc");
		final PageInfo<Artisan> artisanPageInfo = new PageInfo<>(this.artisanMapper.selectAll());
		log.info("[普通写法] - [{}]", artisanPageInfo);
		
		return artisanList;
	}

}
