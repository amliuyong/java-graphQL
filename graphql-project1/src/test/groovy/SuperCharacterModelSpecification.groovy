import com.virtualcodemonkeys.series2project1.models.SuperCharacter
import spock.lang.Ignore
import spock.lang.Specification

class SuperCharacterModelSpecification extends Specification {

    def 'SuperCharacter has required members'(){
        expect: 'a SuperCharacter to return correct values'
          SuperCharacter theChar = SuperCharacter.builder()
            .id("1")
            .name("two")
            .age(3)
            .build()

        theChar.id == "1"
        theChar.name == "two"
        theChar.age == 3
    }
}
