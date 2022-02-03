package com.frowProject.frowAssignment.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.frowProject.frowAssignment.models.FashionLine;

@Component
public class LineDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<FashionLine> findByDesigner(long designerID) {
		List<FashionLine> lines = new ArrayList<>();

		jdbcTemplate.query("SELECT * FROM `Lines` WHERE `DesignerId`=?",
				(rs, rowNum) -> new FashionLine(rs.getInt("LineId"), rs.getInt("DesignerId"), rs.getString("LineTitle"),
						rs.getString("LineSummary"), rs.getDouble("LinePrice")),
				new Object[] { designerID }).forEach(line -> lines.add(line));

		return lines;
	}
}
