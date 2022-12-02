package Week12.GradeBook;

public class GradeBook {
    private String[] studentNames = new String[5];
    private char[] studentLetterGrades = new char[5];
    private Double[][] studentTestGrades = new Double[5][4];
    
    //default constructor only

    //getters
    public String getStudentNameByIndex(int index)
    {
        /*
         * input: index
         * process: n/a
         * output: Student name at index
         */

         return studentNames[index];
    }

    public int getStudentIndexByName(String pName)
    {
        /*
         * Returns the index of the first location of the name found
         * Input: student name
         * Process: find first instance of the name
         * Output: index of the first instance. 
         */
        int index=-1;
        for (int i=0; i<studentNames.length;i++)
        {
            if(studentNames[i].compareTo(pName)==0)
            {
               index = i;
               i=studentNames.length; //immediately exit loop
            }
        }
       
       return index;

    }

    public char getGradeAverageByIndex(int index)
    {
        /*
         * Input: Index
         * Process: n/a
         * Output: Student grade at index
         */
        return studentLetterGrades[index];
    }

    public Double getTestScoreByIndexByIndex(int studentIndex,int testIndex)
    {
        /*
         * Input: studentIndex:Int, testIndex:Int
         * Process: n/a
         * Output: value at StudentTestGrades[StudentIndex][testIndex]
         */
        return studentTestGrades[studentIndex][testIndex];
    }

    public Double getAverageScoreByIndex(int index)
    {
        /*
         * Index refers to the student index. 
         * Input: index
         * Process: calculate grade average
         * Output: return average
         */

        Double grade = calculateGradeAverage(studentTestGrades[index]);

        return grade;
    }

   
    //methods
    public void addStudentAndGrades(int index, String pName,  Double[] pTestGrades)
    {
        /*
         * Input: index to add values at, name:String - Student's name,
         * Grade:Char - student's grade, Double[] - array of the student grades.
         * Process: Set name, grade. Copy the grades array. 
         * Output: n/a
         */

         //set name
         studentNames[index]=pName;

         //set grade average
         studentLetterGrades[index]=calculateGradeAverageLetter(calculateGradeAverage(pTestGrades));

         //copy test grades
         for(int i=0;i<pTestGrades.length;i++)
         {
            studentTestGrades[index][i]=pTestGrades[i];
         }

    }

    public char calculateGradeAverageLetter(Double pTestGradeAverage)
    {
        /*Returns the grade letter based on grade: 
         * 
         * 90–100 A
            80–89 B
            70–79 C
            60–69 D
            0–59 F
         */

         /*Input: grade average 
          * Process: calculate letter grade
          Output: Return letter grade. 
         */

         char gradeAverage;

         if(pTestGradeAverage>=90)
         {
            gradeAverage='A';
         }
         else if (80<=pTestGradeAverage && pTestGradeAverage < 90)
         {
            gradeAverage = 'B';
         }
         else if (70<=pTestGradeAverage && pTestGradeAverage <80)
         {
            gradeAverage = 'C';
         }
         else if (60<=pTestGradeAverage && pTestGradeAverage <70)
         {
            gradeAverage = 'D';
         }
         else
         {
            gradeAverage = 'F';
         }

         return gradeAverage;


    }

    public double calculateGradeAverage(Double[] pTestGrades)
    {
        /*Returns average grade
         * Input: Array of test grades
          * Process: loop through test scores at index, accumulating in a variable, 
         * then dividing by 4. 
         * Output: test average. 
         */
        Double grade =0.0;
        for(int i=0;i<pTestGrades.length;i++)
        {
            grade = grade+pTestGrades[i];
        }

        return grade/pTestGrades.length;
    }
    
}
