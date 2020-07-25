/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.base.mixin;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.HasGridLayout;

/**
 * A mixin for constructing modern css grid layouts.
 *
 * @author kevzlou7979
 * @see HasGridLayout
 */
public class GridLayoutMixin<T extends Widget & HasGridLayout> extends StylePropertyMixin<T> implements HasGridLayout {


    public GridLayoutMixin(T uiObject) {
        super(uiObject);
    }


    @Override
    public void setGrid(String value) {
        setProperty(GRID, value);
    }

    @Override
    public String getGrid() {
        return getProperty(GRID);
    }

    @Override
    public void setGridArea(String value) {
        setProperty(GRID_AREA, value);
    }

    @Override
    public String getGridArea() {
        return getProperty(GRID_AREA);
    }

    @Override
    public void setGridAutoColumns(String value) {
        setProperty(GRID_AUTO_COLUMNS, value);
    }

    @Override
    public String getGridAutoColumns() {
        return getProperty(GRID_AUTO_COLUMNS);
    }

    @Override
    public void setGridAutoFlow(String value) {
        setProperty(GRID_AUTO_FLOW, value);
    }

    @Override
    public String getGridAutoFlow() {
        return getProperty(GRID_AUTO_FLOW);
    }

    @Override
    public void setGridAutoRows(String value) {
        setProperty(GRID_AUTO_ROWS, value);
    }

    @Override
    public String getGridAutoRows() {
        return getProperty(GRID_AUTO_ROWS);
    }
}
