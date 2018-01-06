package io.github.yusukeiwaki.kotlincoroutinesplayground

import kotlinx.coroutines.experimental.delay

class DummyRepository {
    suspend fun execute() {
        if (shouldUseAsync) {
            executeAsync()
        } else {
            executeSync()
        }
    }

    private val shouldUseAsync: Boolean
        get() = true

    private fun executeSync() {
        println("executeSync")
        Thread.sleep(3000)
    }

    private suspend fun executeAsync() {
        println("executeAsync")
        delay(3000)
    }
}
