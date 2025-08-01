import java.util.Scanner;

public class Marks2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Maths", "Chem", "Physics"};

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        sc.nextLine();

        int [][] marks = new int [num][3];

        while(true){
            System.out.println("Usage: add [studentID]");
            System.out.println("Usage: update [studentID] [subjectID]");
            System.out.println("Usage: average_sub [subject ID]");
            System.out.println("Usage: average_stu [student ID]");
            System.out.println("Usage: total [studentID]");
	System.out.println("Usage: grade [studentID] [subjectID]");
            System.out.print("\nEnter what you want: ");
            
            String input = sc.nextLine();
            String[] cmd = input.split(" ");


            if(cmd[0].equalsIgnoreCase("exit")) break;



            switch (cmd[0]){
                case "add":
                    int sId = Integer.parseInt(cmd[1]) - 1;
                    if(sId < 0 || sId >= num){
                        System.out.println("Invalid Student ID");
                        break;
                    }
                    for(int i = 0; i < 3; i++){
                        System.out.println("Enter "+subjects[i]+" marks: ");
                        marks[sId][i] = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.println("Marks added.");
                    break;

                case "update":
                    sId = Integer.parseInt(cmd[1])-1;
                    int subID = Integer.parseInt(cmd[2])-1;
                    if(sId < 0 || sId >= num || subID < 0 || subID > 2) {
                        System.out.println("Invalid stud id or sub id");
                        break;
                    }
                    System.out.print("Enter new mark: ");
                    marks[sId][subID] = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Marks updated");
                    break;

                case "average_stu":
                    sId = Integer.parseInt(cmd[1])-1;
                    int sum = marks[sId][0]+marks[sId][1]+marks[sId][2];
                    System.out.printf("Student %d average: %.2f%n",sId+1,sum/3.0);
                    break;

                case "average_sub":
                    subID = Integer.parseInt(cmd[1])-1;
                    int total = 0;
                    for(int i = 0; i < num; i++) total += marks[i][subID];
                    System.out.printf("%s average: %.2f%n",subjects[subID],total/(double) num);
                    break;

                case "total":
                    sId = Integer.parseInt(cmd[1])-1;
                    sum = marks[sId][0] + marks[sId][1] + marks[sId][2];
                    System.out.printf("Student %d total: %d%n", sId + 1, sum);
                    break;

		case "grade":
			sId = Integer.parseInt(cmd[1])-1;
			int subid = Integer.parseInt(cmd[2])-1;

			int mark = marks[sId][subid];
			if(mark >= 90){
				System.out.println("Grade A");
}
			else if(mark >= 80 || mark <= 89){
				System.out.println("Grade B");
}
			else if(mark >= 70 || mark <= 79){
				System.out.println("Grade C");
}
			else if(mark >= 60 || mark <= 69){
				System.out.println("Grade D");
}
			else {
				System.out.println("Fail");
}
			break;
			
			
			
			
                default:
                    System.out.println("Unknown command");
            }

        }
        System.out.println("Exited");
        sc.close();



    }
}