package class8;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import class6.StudentsManager;
import class7.StudentsManagerFileImpl;

class StudentsModel implements TableModel {

	private StudentsManager manager;

	public StudentsModel(StudentsManager manager) {
		this.manager = manager;
	}

	@Override
	public int getRowCount() {
		return manager.getStudentCount();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Roll Number";
		} else {
			return "Name";
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		class6.Student s = manager.getStudents().get(rowIndex);
		if (columnIndex == 0) {
			return s.getId();
		} else {
			return s.getName();
		}

	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}

public class UniversityFrame extends BaseFrame {

	private JLabel rollLabel, nameLabel;
	private JTextField rollText, nameText;
	private JButton add, modify, delete, find;

	private JTable studentsTable;

	private StudentsModel model;

	@Override
	public void create() {
		rollLabel = new JLabel("Enter Roll Number : ");
		nameLabel = new JLabel("Enter Student Name : ");

		add = new JButton("Add");
		try {
			model = new StudentsModel(new StudentsManagerFileImpl());
		} catch (Exception e) {
		}

		studentsTable = new JTable(model);
	}

	@Override
	public void add(Container con) {
		BorderLayout b = new BorderLayout();
		con.setLayout(b);
		con.add(new JScrollPane(studentsTable), "South");

	}

	@Override
	public void addListeners() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new UniversityFrame();

	}

}
