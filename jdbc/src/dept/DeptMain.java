package dept;

import java.awt.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		
		while (run) {
			System.out.println("********************");
			System.out.println(" 1.-primera opcion");
			System.out.println(" 2.-segunda opcion");
			System.out.println(" 3.-primera opcion");
			System.out.println(" 4.-segunda opcion");
			System.out.println(" 5.-primera opcion");
			System.out.println(" 6.-primera opcion");
			System.out.println("********************");
			
			
		}
		System.out.println("seleccion");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			List<DeptDTO> list=dao.getRows();
			
			System.out.println("algo");
			
			for (DeptDTO dto : list) {
				System.out.print(dto.getDeptNo()+"\t");
				System.out.print(dto.getDname()+"\t");
				System.out.print(dto.getLoc());
			
			}
			
			System.out.println();
			
			break;
		case 2:
			System.out.println("\n algo");
			int deptNo = sc.nextInt();
			
			DeptDTO dto1= dao.getRow(deptNo);
			System.out.println("menu");
			System.out.println("algo mas"+dto1.getDeptNo());
			System.out.println("algo mas2"+dto1.getDname());
			System.out.println("algo mas3"+dto1.getLoc());
			System.out.println();
			break;
		case 3:
			System.out.println("algo en 3");
			System.out.println("numero: ");
			int newDeptNo = sc.nextInt();
			System.out.println("algo: ");
			int newDname =sc.nextInt();
			System.out.print("algo :");
			
			String newLoc = sc.next();
			
			DeptDTO dto = new DeptDTO(newDeptNo,newDname,newLoc);
			System.out.println(dao.insert(dto)?"coneccion ok": "conecion x");
			System.out.println();
			
	
			break;
		case 4:
			System.out.println(" \n algo");
			System.out.println("algun numero :");
			int updateDeptNo = sc.nextInt();
			System.out.println("algo :");
			String updateDname =sc.next();
			
			System.out.println(dao.update(updateDname, updateDeptNo)? "coneccion ok" : "coneccion x");
			System.out.println();
			break;
		case 5:
			System.out.println(" \n algo");
			System.out.println("algun numero :");
			int removeDeptNo = sc.nextInt();
			
			
			System.out.println(dao.delete(removeDeptNo)? "coneccion ok" : "coneccion x");
			System.out.println();
			
	
			break;
		case 6:
			run = false;
			break;

		default:
			System.out.println("finish");
			break;
		}
	
	}

}
