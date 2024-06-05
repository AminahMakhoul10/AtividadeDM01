package com.example.atividadedm01.ui.theme.api.response

import com.example.atividadedm01.ui.theme.api.model.Usuario

data class LoginResponseBody (
    var token: String = "",
    var usuario: Usuario

)