```shell
# Directory Structures
src
├── main
│   ├── kotlin
│   │   └── io
│   │       └── odontolabissiva
│   │           └── clairvoyanceservice
│   │               ├── ClairvoyanceServiceApplication.kt
│   │               ├── common
│   │               ├── config
│   │               │   ├── DatasourceConfig.kt
│   │               │   └── ExceptionHandler.kt
│   │               ├── constant
│   │               ├── domain
│   │               │   ├── gateway
│   │               │   │   ├── api
│   │               │   │   │   └── GatewayApi.kt
│   │               │   │   ├── dto
│   │               │   │   │   └── GatewayDto.kt
│   │               │   │   ├── entity
│   │               │   │   ├── mapper
│   │               │   │   ├── repository
│   │               │   │   └── service
│   │               │   └── user
│   │               │       ├── api
│   │               │       │   └── UserApi.kt
│   │               │       ├── dto
│   │               │       │   └── UserDto.kt
│   │               │       ├── entity
│   │               │       ├── mapper
│   │               │       ├── repository
│   │               │       └── service
│   │               └── util
│   └── resources
│       ├── application.properties
│       ├── static
│       └── templates
└── test
    └── kotlin
        └── io
            └── odontolabissiva
                └── clairvoyanceservice
                    └── ClairvoyanceServiceApplicationTests.kt
```