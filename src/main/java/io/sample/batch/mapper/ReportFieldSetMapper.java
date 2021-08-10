package io.sample.batch.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import io.sample.batch.bean.Report;

/**
 * Step 1 
 * 
 * @author house
 *
 */
public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	final Logger logger = LoggerFactory.getLogger(ReportFieldSetMapper.class);

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		Report report = new Report();
		report.setId(fieldSet.readInt(0));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setQty(fieldSet.readInt(2));
		report.setStaffName(fieldSet.readString(3));

		//default format yyyy-MM-dd
		//fieldSet.readDate(4);
		String date = fieldSet.readString(4);
		
		logger.info("step1     data == " + date);

		try {
			report.setDate(dateFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return report;
	}

}