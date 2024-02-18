// package com.test.formonix.student;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.times;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.MockitoAnnotations;

// public class StudentServiceTest {

// @InjectMocks
// private StudentService studentService;

// @Mock
// private StudentRepository repository;

// @Mock
// private StudentMapper studentMapper;

// @BeforeEach
// void setUp() {
// MockitoAnnotations.openMocks(this);
// }

// @Test
// public void shout_successfully_save_a_student() {
// // Given
// StudentDto dto = new StudentDto("John", "Doe", "johnd@mail.com", 1);

// Student student = new Student();

// Student saveStudent = new Student();

// // When
// StudentResponseDto responseDto = studentService.saveStudnet(dto);

// // Mock the calls
// when(studentMapper.toStudent(dto).thenReturn(student));
// when(repository.save(student).thenReturn(saveStudent));
// when(studentMapper.toStudentResponseDto(saveStudent))
// .thenReturn(new StudentResponseDto("John", "Doe", "johnd@mail.com"));

// // Then
// assertEquals(dto.firstname(), responseDto.firstname());
// assertEquals(dto.lastname(), responseDto.lastname());
// assertEquals(dto.email(), responseDto.email());

// verify(studentMapper, times(1))
// .toStudent(dto);
// verify(repository, times(1))
// .save(student);
// verify(studentMapper, times(1))
// .toStudentResponseDto(saveStudent);

// }

// @Test
// public void should_return_all_students() {
// // Given
// List<Student> student = new ArrayList<>();
// students.add(new Student("John", "Doe", "johnd@mail.com", 20));

// // Mock the calls
// when(repository.findAll()).thenReturn(students);
// when(studentMapper.toStudentResponseDto(any(Student.class)))
// .thenReturn(new StudentResponseDto("John", "Doe", "johnd@mail.com"));

// // When
// List<StudentResponseDto> responseDtos = studentService.findAllStudent();

// // Then
// assertEquals(students.size(), responseDto.size());
// verify(repository, times(1)).findAll();
// }

// @Test
// public void should_return_all_students_by_id() {
// Integer studentId = 1;
// Student student = new Student("John", "Doe", "johnd@mail.com", 20);

// //mock the calls
// when(repository.findById(studentId))
// .thenReturn(Optional.of(student));
// when(studentMapper.toStudentResponseDto(any(Student.class)))
// .thenReturn(new StudentResponseDto("John", "Doe", "johnd@mail.com"));

// // When
// StudentResponseDto dto = studentService.findStudentById(studentId);

// //then
// assertEquals(dto.firstname(), student.firstname());
// assertEquals(dto.lastname(), student.lastname());
// assertEquals(dto.email(), student.email());

// verify(repository, times(1)).findById(studentId);

// }

// @Test
// public void should_find_student_by_name() {
// // Given
// String studentName = "John";
// List<Student> student = new ArrayList<>();
// students.add(new Student("John", "Doe", "johnd@mail.com", 20));

// // Mock the calls
// when(repository.findAllByFirstnameContaining("studentName")).thenReturn(students);
// when(studentMapper.toStudentResponseDto(any(Student.class)))
// .thenReturn(new StudentResponseDto("John", "Doe", "johnd@mail.com"));

// //when
// var responseDto = studentService.findAllStudentByName(studentName);

// // Then
// assertEquals(students.size(), responseDto.size());

// verify(repository, times(1))
// .findAllByFirstnameContaining(studentName);

// }

// }
