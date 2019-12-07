/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
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
package org.spongepowered.api.world.volume.archetype.block.entity.stream;

import org.spongepowered.api.block.entity.BlockEntityArchetype;
import org.spongepowered.api.world.volume.archetype.block.entity.MutableBlockEntityArchetypeVolume;
import org.spongepowered.api.world.volume.archetype.block.entity.UnmodifiableBlockEntityArchetypeVolume;
import org.spongepowered.api.world.volume.archetype.block.entity.StreamableBlockEntityArchetypeVolume;
import org.spongepowered.api.world.volume.function.VolumeResult;
import org.spongepowered.api.world.volume.stream.VolumeStream;

import java.util.function.Predicate;

/**
 * A worker for a block volume. Used to perform operations on all the blocks it
 * contains. When operations are done on multiple volumes, they are aligned on
 * their minimum coordinates. The other volumes must be at least as big as the
 * backing one.
 *
 * @param <V> The type of volume being worked on
 */
public interface BlockEntityArchetypeStream<V extends StreamableBlockEntityArchetypeVolume<V>, M extends MutableBlockEntityArchetypeVolume<M>>
    extends VolumeStream<V, UnmodifiableBlockEntityArchetypeVolume<?>, M> {

    @Override
    BlockEntityArchetypeStream<V, M> filter(Predicate<VolumeResult<V, ? super BlockEntityArchetype>> predicate);
}
