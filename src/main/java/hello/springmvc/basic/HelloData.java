package hello.springmvc.basic;


import lombok.Data;

@Data
/**
 * Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode, Value를 자동으로 생성
 */
public class HelloData {
    private String username;
    private int age;
}
