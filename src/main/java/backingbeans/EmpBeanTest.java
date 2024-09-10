//package backingbeans;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import beans.Emp;
//import dao.EmpDao;
//
//public class EmpBeanTest {
//	@Mock
//	private EmpDao empDaoMock; // EmpDaoをモック化
//	@InjectMocks
//	private EmpBean empBean; // モックされたEmpDaoを使用するEmpBeanのインスタンス
//
//	@BeforeEach
//	public void 前準備() {
//		// @InjectMockが付いているオブジェクトのフィールドに
//		// @Mockが付与されたモックを注入する。
//		MockitoAnnotations.openMocks(this); // Mockitoのアノテーションを初期化
//		// モック daoのfindAllの振る舞いを変更。
//		when(empDaoMock.findAll()).thenReturn(
//				Arrays.asList(
//						new Emp("John Doe", "john.doe@example.com"),
//						new Emp("test user", "test@example.com")));
//	}
//
//	@Test
//	public void empを追加したら文字列resultを返す() {
//		// テスト用のEmployeeオブジェクトを作成
//		Emp employee = new Emp();
//		employee.setName("John Doe");
//		employee.setEmail("john.doe@example.com");
//		// EmpBeanのemployeeフィールドをセット
//		empBean.setEmployee(employee);
//		// addEmployeeメソッドを呼び出し
//		String result = empBean.addEmployee();
//		// EmpDaoのaddEmployeeメソッドが1回呼ばれたことを確認
//		verify(empDaoMock, times(1)).addEmployee(employee);
//		// メソッドの結果を確認
//		assertEquals("result", result);
//	}
//
//	@Test
//	public void empを2件作ったら2件返す() {
//		// 実行
//		List<Emp> employees = empDaoMock.findAll();
//		// 検証
//		assertEquals(2, employees.size());
//	}
//}
