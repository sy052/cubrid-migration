/*
 * Copyright 2016 CUBRID Corporation. All rights reserved by Search Solution. 
 *
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met: 
 *
 * - Redistributions of source code must retain the above copyright notice, 
 *   this list of conditions and the following disclaimer. 
 *
 * - Redistributions in binary form must reproduce the above copyright notice, 
 *   this list of conditions and the following disclaimer in the documentation 
 *   and/or other materials provided with the distribution. 
 *
 * - Neither the name of the <ORGANIZATION> nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software without 
 *   specific prior written permission. 
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 * OF SUCH DAMAGE. 
 *
 */
package com.cubrid.cubridmigration.ui.history.tableviewer;

import com.cubrid.common.ui.swt.table.BaseTableLabelProvider;
import com.cubrid.cubridmigration.core.engine.report.ObjNameMigrationResult;

/**
 * 
 * DB object name change page provider
 * 
 * @author Dongmin Kim
 *
 */
public class MigrationObjectNameChangeTableLabelProvider extends 
		BaseTableLabelProvider {
	
	/**
	 * Retrieves the column's text by column index
	 * 
	 * @param element to be displayed.
	 * @param columnIndex is the index of column. Begin with 0.
	 * @return String to be filled in the column.
	 * 
	 */
	public String getColumnText(Object element, int columnIndex) {
		ObjNameMigrationResult rs = (ObjNameMigrationResult) element;
		switch (columnIndex) {
		case 0:
			return rs.getObjType();
		case 1:
			return rs.getObjSourceName();
		case 2:
			return rs.getObjTargetName();
		default:
			return null;
		}
	}
}
