package com.artisan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artisan.model.Artisan;
import com.artisan.result.CodeMsg;
import com.artisan.result.Result;
import com.artisan.service.ArtisanService;

@RestController
public class ArtisanController {

	@Autowired
	private ArtisanService artisanService;

	// 正常情况
	@GetMapping("/artisans")
	public Result<List<Artisan>> selectAllArtisan() {
		return Result.success(artisanService.getAllArtisanList());
	}

	// 模拟异常情况
	@GetMapping("/artisansError")
	public Result<List<Artisan>> selectAllArtisanError() {
		return Result.error(CodeMsg.SERVER_ERROR);
	}

	// 分页 http://localhost:8080/artisansPage?pageNum=2&pageSize=3
	@GetMapping("/artisansPage")
	public Result<List<Artisan>> selectPageArtisan(int pageNum, int pageSize) {
		return Result.success(artisanService.getArtisanListByPage(pageNum, pageSize));
	}

	// 自定义xml 查询
	@GetMapping("/selectAllArtisansByXml")
	public Result<List<Artisan>> selectAllArtisansByXml() {
		return Result.success(artisanService.getAllArtisanListByXml());
	}

	// 注解 查询
	@GetMapping("/selectAllArtisansByAnno")
	public Result<List<Artisan>> selectAllArtisansByAnno() {
		return Result.success(artisanService.getAllArtisanListByAnno());
	}
}
