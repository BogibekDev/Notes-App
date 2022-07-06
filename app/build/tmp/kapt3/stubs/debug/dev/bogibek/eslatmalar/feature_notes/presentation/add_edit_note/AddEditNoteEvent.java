package dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "", "()V", "ChangeColor", "ChangeContentFocus", "ChangeTitleFocus", "EnteredContent", "EnteredTitle", "SaveNote", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$EnteredTitle;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeTitleFocus;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$EnteredContent;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeContentFocus;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeColor;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$SaveNote;", "app_debug"})
public abstract class AddEditNoteEvent {
    
    private AddEditNoteEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$EnteredTitle;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class EnteredTitle extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.EnteredTitle copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public EnteredTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeTitleFocus;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "(Landroidx/compose/ui/focus/FocusState;)V", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChangeTitleFocus extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        @org.jetbrains.annotations.NotNull()
        private final androidx.compose.ui.focus.FocusState focusState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.ChangeTitleFocus copy(@org.jetbrains.annotations.NotNull()
        androidx.compose.ui.focus.FocusState focusState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ChangeTitleFocus(@org.jetbrains.annotations.NotNull()
        androidx.compose.ui.focus.FocusState focusState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.compose.ui.focus.FocusState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.compose.ui.focus.FocusState getFocusState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$EnteredContent;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class EnteredContent extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.EnteredContent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public EnteredContent(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeContentFocus;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "(Landroidx/compose/ui/focus/FocusState;)V", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChangeContentFocus extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        @org.jetbrains.annotations.NotNull()
        private final androidx.compose.ui.focus.FocusState focusState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.ChangeContentFocus copy(@org.jetbrains.annotations.NotNull()
        androidx.compose.ui.focus.FocusState focusState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ChangeContentFocus(@org.jetbrains.annotations.NotNull()
        androidx.compose.ui.focus.FocusState focusState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.compose.ui.focus.FocusState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.compose.ui.focus.FocusState getFocusState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$ChangeColor;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "color", "", "(I)V", "getColor", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class ChangeColor extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        private final int color = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.ChangeColor copy(int color) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ChangeColor(int color) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getColor() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent$SaveNote;", "Ldev/bogibek/eslatmalar/feature_notes/presentation/add_edit_note/AddEditNoteEvent;", "()V", "app_debug"})
    public static final class SaveNote extends dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent {
        @org.jetbrains.annotations.NotNull()
        public static final dev.bogibek.eslatmalar.feature_notes.presentation.add_edit_note.AddEditNoteEvent.SaveNote INSTANCE = null;
        
        private SaveNote() {
            super();
        }
    }
}