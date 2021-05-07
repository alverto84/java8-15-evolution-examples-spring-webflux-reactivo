package windoctor7.github.io.kotlin.spring.springkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class CocheController {

    @GetMapping("/coches")
    fun coches():List<Coche> {
    	return listOf(
    		Coche("1010BBR", "Renault", "Cinco", "Azul"),
    		Coche("1012BJA", "Fiat", "Bravo", "Rojo")
    		)
    	}


}