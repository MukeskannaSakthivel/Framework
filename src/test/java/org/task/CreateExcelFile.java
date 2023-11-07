package org.task;

import java.io.IOException;

import org.baseclass.BaseClass;

public class CreateExcelFile extends BaseClass{
	public static void main(String[] args) throws IOException {
		String[][] data = {{"Name","course"},{"ravi","sql"},{"mukes","java"},{"santhosh","python"},{"praveen","ruby"},
				{"saravana","javascript"},{"naren","c"},{"dheepak","c++"},{"karthi","c#"},{"thiru","react"},{"Suriya","angular"}};
		
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				createExcelRowsAndCells( "StudentsData", "Data", i, j, data[i][j]);
			}
		}
	}
}
