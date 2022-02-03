package com.frowProject.frowAssignment.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.frowProject.frowAssignment.models.Outfit;

@Component
public class OutfitDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Outfit> findByLine(long lineID) {
		List<Outfit> outfits = new ArrayList<>();

		jdbcTemplate.query("SELECT * FROM Outfits WHERE LineId=?",
				(rs, rowNum) -> new Outfit(rs.getInt("OutfitId"), rs.getInt("LineId"), rs.getInt("DesignerId"),
						rs.getString("OutfitTitle"), rs.getString("Description"), rs.getDouble("Price")),
				new Object[] { lineID }).forEach(outfit -> outfits.add(outfit));

		return outfits;
	}
}
