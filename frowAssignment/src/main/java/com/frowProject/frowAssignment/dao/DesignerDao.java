package com.frowProject.frowAssignment.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.frowProject.frowAssignment.models.Designer;

@Component
public class DesignerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Designer> findDesigners() {
		List<Designer> designers = new ArrayList<Designer>();

		jdbcTemplate
				.query("SELECT * FROM Designers",
						(rs, rowNum) -> new Designer(rs.getInt("DesignerId"), rs.getString("Designer"),
								rs.getString("Summary"), rs.getString("Location")))
				.forEach(designer -> designers.add(designer));

		return designers;
	}

}
