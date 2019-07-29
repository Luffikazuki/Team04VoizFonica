package com.example.samples;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Plan {
    private final int id;
    private final String name;
}
