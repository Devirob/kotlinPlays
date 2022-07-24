package ovh.skrzynia.kotlinPlays

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID


@RestController
@RequestMapping("/notes")
@EnableAutoConfiguration
class NoteController {

    @GetMapping(
        value = ["/obtain"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun getNotes(): List<Note> {

        return listOf(
            Note(
                UUID.randomUUID().toString(),
                "A first one note",
                "Some meat..."
            ),
            Note(
                UUID.randomUUID().toString(),
                "Second one",
                "Some more meat",
                "Gdansk"
            )
        )
    }
}