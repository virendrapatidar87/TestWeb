/**
 * 
 */
package com.test.dto;

/**
 * @author Virendra.Patidar
 *
 */
public class PatientRecordDTO {
	private String docname, date,time,filename;

	/**
	 * @return the docname
	 */
	public String getDocname() {
		return docname;
	}

	/**
	 * @param docname the docname to set
	 */
	public void setDocname(String docname) {
		this.docname = docname;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
