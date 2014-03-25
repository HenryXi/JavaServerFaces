
package com.xxy;

import java.util.Arrays;
import java.util.Comparator;
import javax.faces.model.DataModel;

public class SortableDataModel<E> extends DataModel<E>{

	DataModel<E> model;
	private Integer[] rows;
	
	SortableDataModel(DataModel<E> model){
		this.model = model;
		initRows();
	}
	
	public void initRows(){
		int rowCount = model.getRowCount();
		if(rowCount != -1){
			this.rows = new Integer[rowCount];
			for(int i = 0; i < rowCount; ++i){
				rows[i] = i;
			}
		}
	}
	
	public void sortBy(final Comparator<E> comparator){
		Comparator<Integer> rowComp = new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2){
				E o1 = getData(i1);
				E o2 = getData(i2);
				return comparator.compare(o1, o2);
			}
		};
		Arrays.sort(rows, rowComp);
		
	}
	
	private E getData(int row){
		int originalRowIndex = model.getRowIndex();
		
		model.setRowIndex(row);
		E newRowData = model.getRowData();
		model.setRowIndex(originalRowIndex);
		
		return newRowData;
	}
	
	@Override
	public void setRowIndex(int rowIndex) {

		if(0 <= rowIndex && rowIndex < rows.length){
			model.setRowIndex(rows[rowIndex]);
		}else{
			model.setRowIndex(rowIndex);
		}
	}
	
	@Override
	public boolean isRowAvailable() {
		return model.isRowAvailable();
	}

	@Override
	public int getRowCount() {
		return model.getRowCount();
	}

	@Override
	public E getRowData() {
		return model.getRowData();
	}

	@Override
	public int getRowIndex() {
		return model.getRowIndex();
	}

	@Override
	public Object getWrappedData() {
		return model.getWrappedData();
	}

	@Override
	public void setWrappedData(Object data) {
		
		model.setWrappedData(data);
		initRows();
		
	}
	
}