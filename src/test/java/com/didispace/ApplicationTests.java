package com.didispace;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.training.Application;
import com.training.dubbo.dto.DubboDemoDto;
import com.training.dubbo.service.DubboDemoService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

	@Autowired
	DubboDemoService dubboDemoService;
	
	@Test
	public void testGetDubboDemoDto() {
		DubboDemoDto dubboDemoDto = dubboDemoService.getDubboDemoDto();
		Assert.assertEquals("张三", dubboDemoDto.getName());
	}
	
	@Test
	public void testFindAllDubboDemoDto() {
		List<DubboDemoDto> list = dubboDemoService.findAllDubboDemoDto();
		Assert.assertEquals(2, list.size());
	}

}
