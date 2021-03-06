/*
 * Copyright (c) 2010-2014 Norbert Bartels
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import com.restfb.AbstractJsonMapperTests;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PageRatingTest extends AbstractJsonMapperTests {
    
    @Test
    public void check() {
        PageRating exampleRating =
        createJsonMapper().toJavaObject(jsonFromClasspath("v1_0/page-rating"), PageRating.class);
        assertEquals(new Date(1409827400000L), exampleRating.getCreatedTime());
        assertEquals("123456789", exampleRating.getFrom().getId());
        assertEquals("Tester", exampleRating.getFrom().getName());
        assertEquals(4, exampleRating.getRating());
        assertEquals("Everything is nice here!", exampleRating.getReview());
    }
}
