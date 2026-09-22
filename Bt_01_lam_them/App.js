import React, { useState } from 'react';
import {
  Pressable,
  StyleSheet,
  Text,
  View,
} from 'react-native';
import { StatusBar } from 'expo-status-bar';
import { SafeAreaProvider, SafeAreaView } from 'react-native-safe-area-context';

const tiles = {
  one: { label: '1', color: '#1D7BF2' },
  two: { label: '2', color: '#F53235' },
  three: { label: '3', color: '#FFD21A', textColor: '#000000' },
  four: { label: '4', color: '#2BB36A' },
  five: { label: '5', color: '#7B3BDA' },
  six: { label: '6', color: '#FF760D' },
};

function NumberTile({ tile, onPress }) {
  return (
    <Pressable
      accessibilityLabel={`Ô số ${tile.label}`}
      accessibilityRole="button"
      onPress={onPress}
      style={({ pressed }) => [
        styles.tile,
        { backgroundColor: tile.color },
        pressed && styles.tilePressed,
      ]}
    >
      <Text style={[styles.tileNumber, { color: tile.textColor || '#FFFFFF' }]}>
        {tile.label}
      </Text>
    </Pressable>
  );
}

export default function App() {
  const [selectedTile, setSelectedTile] = useState(null);

  const selectTile = (tile) => {
    setSelectedTile(tile);
  };

  return (
    <SafeAreaProvider>
      <SafeAreaView style={styles.safeArea}>
        <StatusBar style="dark" />
        <View style={styles.screen}>
          <View style={styles.board}>
            <View style={styles.topRow}>
              <NumberTile tile={tiles.one} onPress={() => selectTile('1')} />
              <NumberTile tile={tiles.two} onPress={() => selectTile('2')} />
            </View>

            <View style={styles.middleRow}>
              <View style={styles.smallTile}>
                <NumberTile
                  tile={tiles.three}
                  onPress={() => selectTile('3')}
                />
              </View>
              <View style={styles.smallTile}>
                <NumberTile
                  tile={tiles.four}
                  onPress={() => selectTile('4')}
                />
              </View>
              <View style={styles.smallTile}>
                <NumberTile
                  tile={tiles.five}
                  onPress={() => selectTile('5')}
                />
              </View>
              <View style={styles.smallTile} />
            </View>

            <View style={styles.bottomRow}>
              <NumberTile tile={tiles.six} onPress={() => selectTile('6')} />
            </View>
          </View>

          <View style={styles.studentInfo}>
            <Text style={styles.studentName}>Nguyễn Doãn Huy - BIT240115</Text>
            {selectedTile ? (
              <Text style={styles.selectionHint}>Đã chọn ô {selectedTile}</Text>
            ) : null}
          </View>
        </View>
      </SafeAreaView>
    </SafeAreaProvider>
  );
}

const styles = StyleSheet.create({
  safeArea: {
    flex: 1,
    backgroundColor: '#FFFFFF',
  },
  screen: {
    flex: 1,
    paddingHorizontal: 16,
    paddingTop: 12,
    paddingBottom: 10,
  },
  board: {
    width: '100%',
    gap: 16,
  },
  topRow: {
    width: '100%',
    aspectRatio: 2.1,
    flexDirection: 'column',
    gap: 16,
  },
  middleRow: {
    width: '100%',
    aspectRatio: 2.55,
    flexDirection: 'row',
    gap: 16,
  },
  bottomRow: {
    width: '100%',
    aspectRatio: 2.95,
  },
  smallTile: {
    flex: 1,
  },
  tile: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 2,
  },
  tilePressed: {
    opacity: 0.72,
  },
  tileNumber: {
    fontSize: 72,
    fontWeight: '700',
    lineHeight: 84,
  },
  studentInfo: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'flex-end',
    paddingBottom: 6,
  },
  studentName: {
    color: '#404040',
    fontSize: 22,
    fontWeight: '600',
  },
  selectionHint: {
    color: '#808080',
    fontSize: 13,
    marginTop: 5,
  },
});
