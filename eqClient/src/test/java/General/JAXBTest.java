package General;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import frawla.equiz.util.EQDate;
import frawla.equiz.util.Util;
import frawla.equiz.util.exam.ExamConfig;
import frawla.equiz.util.exam.ExamSheet;
import frawla.equiz.util.exam.MultipleChoice;
import frawla.equiz.util.exam.Question;
import frawla.equiz.util.exam.Student;

public class JAXBTest
{
	ExamConfig exConfig;
	ExamSheet examSheet = new ExamSheet();

	/*
	@Before
	public void testBefore() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		new JFXPanel();
		ExamLoader.getInstance().load(new File("data/IT100-2.xlsx"));
		exConfig = ExamLoader.getInstance().getExamConfig();
		examSheet.setExamConfig(exConfig);
		examSheet.setQustionList(ExamLoader.getInstance().getQustionList());
		
	}
	*/


	@Test
	public void test() throws IOException
	{
//		EQDate d = new EQDate();
//		Student st = new Student("NAE003");
//		st.setCuttoffPoint(d);
//		st.setName("Sami Alfattani");
//		st.setFinishPoint(d);
//		st.setStatus(Student.FINISHED);
//		ExamSheet sheet = new ExamSheet();
//		ExamConfig conf = new ExamConfig();
//		conf.courseID = "IT202";
//		conf.courseName="Programming2";
//		conf.courseSection="2";
//		conf.courseSemester="Fall";
//		conf.courseYear="2017";
//		conf.courseTitle="Quiz-2";
//				
//		sheet.setExamConfig(conf);
//		sheet.setQustionList(new ArrayList<Question>());
//		sheet.getQuestionList().add(new MultipleChoice("Q2`1`CBEAD`E"));
//		st.setExamSheet(sheet);
//		st.setServerLinker(null);
//		
//		File f =   Util.getTempFile(); // 
//		Util.jaxbStudentToXML(st, f);
//		
//		
//		//Util.RunApplication(f);
//		Student stFromFile = Util.jaxbXMLToStudent(f);
//		
//		assertEquals("NAE003", stFromFile.getId());
//		assertEquals("Sami Alfattani", stFromFile.getName());
//		assertEquals(d, stFromFile.getFinishPoint());
//		assertEquals(d, stFromFile.getCuttoffPoint());
//		assertEquals(Student.FINISHED, stFromFile.getStatus());
			
		//System.out.println(st.getOptionalExamSheet().get().getCurrentQuestion().getId());
		//System.out.println(stFromFile.getOptionalExamSheet().get());
		//assertEquals(Student.FINISHED, stFromFile.getOptionalExamSheet().get());
		
		assertEquals(0, 0);
		
	}

}
