/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2005-2024 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.axelor.apps.businessproject.rest.dto;

import java.util.List;

public class ProjectReportingCategoryResponse {

  protected String title;
  protected final List<ProjectReportingIndicatorResponse> indicatorList;
  protected final List<ProjectReportingCategoryResponse> subCategoryList;

  public ProjectReportingCategoryResponse(
      String title,
      List<ProjectReportingIndicatorResponse> indicatorList,
      List<ProjectReportingCategoryResponse> subCategoryList) {
    this.title = title;
    this.indicatorList = indicatorList;
    this.subCategoryList = subCategoryList;
  }

  public String getTitle() {
    return title;
  }

  public List<ProjectReportingIndicatorResponse> getIndicatorList() {
    return indicatorList;
  }

  public List<ProjectReportingCategoryResponse> getSubCategoryList() {
    return subCategoryList;
  }
}